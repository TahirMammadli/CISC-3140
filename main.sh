#!/bin/bash



function main(){
    
    echo "Enter date 1: "
    scDate1=`date +%m-%d-%Y`
    read scDate1
    echo $scDate1
    echo "Please pick a dates from the saved dates such as lab2, lab3, lab4 or final. Enter 1 for lab2, 2 for lab3, 3 for lab4 and 4 for final exam. If you want to enter a custom date press 5"
    read scDatePickerInt
    lab2Date="10/26/2022"
    lab3Date="11/23/2022"
    lab4Date="12/07/2022"
    finalExamDate="12/19/2022"

    case $scDatePickerInt in  
        1)  
            scDate2=$lab2Date  
            ;;  
        2)  
            scDate2=$lab3Date 
            ;;  
        3)  
            scDate2=$lab4Date 
            ;;  
        4)  
            scDate2=$finalExamDate               
            ;;  
        5)  echo "Enter date 2: "
            read scDate2
            ;;  
    esac 
       
    echo "The difference: "
    echo "($(date +%s -d $scDate1)-$(date +%s -d $scDate2))/86400" | bc
    

    }

main