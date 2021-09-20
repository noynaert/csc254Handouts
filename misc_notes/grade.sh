#!/usr/bin/bash

## Takes apart a canvas download and processes each 
## student's assignment
##
## noynaert
## September 2021
##
## Written for hmwk01
## Must be in the directory with student files
## and data.*.txt files


for f in *.java; do

   #get student name
   echo "Processing $f"
   student=$(echo $f | cut -d _ -f 1)
   echo $student

   #Get java file name
   jName=${f##*_}
   #echo $jName
   
   #Does the file exist?  If so, remove
   if [ -d $student ]; then
      rm -r $student
   fi

   #make dir and copy file file
   mkdir $student
      #remove the package, and copy the file to the directory
   sed 's/^\s*package\s/\/\/package /' $f > $student/$jName
   
   #go to the directory and operate on the file(s)
   cd $student

   #cleanup  (Probably not needed because the directories are recreated each pass)
   if [ -f out.txt ];then
      rm out.txt
   fi
   if [ -f *.class ];then
      rm *.class
   fi


   #start out.txt with source code
   for j in *.java 
   do
        pr -n -h "$student $j" $j > out.txt
      javac *.java &>> out.txt
      if [ $? -eq 0 ]; then
         echo "   Successful compile of $j"
         cowsay "Successful Compile! of $j" >> out.txt
         for data in ../data*.txt; do
            echo "------------------------------ input $data -----------------------------" >> out.txt
            echo "Data is $(cat $data)" >> out.txt
            echo >> out.txt
            if [ -e ${j%%.java}.class ];then
              echo >> out.txt
              java ${j%%.java} < $data &>> out.txt
              if [ $? -ne 0 ]; then
                 cowsay -d "Run aborted with error code $?" >> out.txt
              fi
              echo >> out.txt
            fi
         done
      else
         cowsay -d "Compile of $j Failed" >> out.txt
         echo "   FAILED TO COMPILE $j"
      fi
   done

   cowsay -f /home/noynaert/cowsay-files/cows/ackbar.cow  "IT'S A TRAP!  The last run should have ended in an error because the input was text, not a number." >> out.txt

   # Go back to parent
   cd ..

   #sleep 1
   

done
