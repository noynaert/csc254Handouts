#!/usr/bin/bash
echo '# Fall 2022 Schedule' > 2022fall.md
echo '' >> 2022fall.md
echo 'Calendar|Week|Note' >> 2022fall.md
echo ':---|:---:|:--' >> 2022fall.md
for m in 8 9 10 11 12 
do
	cal $m 2022 >> 2022fall.md 
done
sed -i '5,$ s/ $/\`|| /' 2022fall.md
sed -i '5,$ s/^/\`/' 2022fall.md 
sed -i '5,$ s/ / /g' 2022fall.md

