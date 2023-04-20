var a = new Array(50, 32, 77, 21, 22, 31, 99,44);
min = a[0], max = a[0];

for(i=0;i<a.length;i++){
    if(a[i] < min){
        min = a[i];
    }

    if(a[i] > max){
        max = a[i];
    }
}

document.write("Maximum is: "+max);
document.write("</br>Minimum is: "+min);