cat words.txt|awk '{for(i=1;i<=NF;i++)print $i}'|sort|uniq -c|sort -rn|awk '{print $2,$1}'