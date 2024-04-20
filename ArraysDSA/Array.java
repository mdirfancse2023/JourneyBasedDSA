import java.util.*;
class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        myArray obj = new myArray();
        int arr[] = new int[10];
        int ele = sc.nextInt();
        int pos = sc.nextInt();
        obj.insert(arr,ele,pos);
        obj.delete(arr,pos);
        obj.update(arr,pos,ele);
        obj.display(arr);
        sc.close();
        
    }
}
class myArray{
    int size = 0;
    void insert(int arr[],int ele,int pos){
        if(size<arr.length){
            arr[pos-1] = ele;
            size++;
        }
    }
    void delete(int arr[],int pos){
        arr[pos-1] = 0;
        size--;
    }
    void update(int arr[],int pos,int ele){
        arr[pos-1] = ele;
    }
    void display(int arr[]){
        for (int e : arr) {
            System.out.println(e);
        }
    }
}