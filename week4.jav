A(){
    int i, j;
    for(i=1 to n; i++){
        for(j=1 to n; j++){
            print();
        }
    }
    
}



// independent loops so multiply the time complexity: O(n^2)

//#3

three(){
    int i;
    for (i=1; i^2 <= n; i++){
        print();
    }
}
// O(n^1/2)

//#4

four(){
    int i;
    for (i=1; i <= n; i=i*2){
        print();
    }
}
// O(log n)

//#5
five(){
    int i,s;                        //i=1, 2, 3, 4, 5, 6, .... k
    while(s < n){                   //s = 1, 3, 6, 10, 15, 21, ...k
        s = s + 1;
        i++;
        print();
    }
}

//6
six(){
    int i;
    for (i=n/2; i <= n; i++){
        for (j=1; j <= n/2; j++){
            for(k=1; k <= n; k=k*2){
                print();
            }
        }
    }
}
//independent loops
// O(n^2 log n)

//#7
seven(){
    int i;
    for (i=1; i <= n; i++){
        for (j=1; j <= i^2; j++){
            for(k=1; k <= n/2; k++ ){
                print();
            }
        }
    }
}
//dependent loops
// O(n^4)

//#8
eight(){
    int i;
    for (i=n/2; i <= n; i++){
        for (j=1; j <= n; j=j*2){
            for(k=1; k <= n; k=k*2 ){
                print();
            }
        }
    }
}
//Independent loops
// O(n log n)