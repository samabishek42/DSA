package Arraysss;

public class Arraysss {
      int[] arr;
      int count;

      public Arraysss(int length){
            arr=new int[length];
      }

      public  void print(){
            for(int i=0;i< count;i++){
                  System.out.println(arr[i]);
            }
      }

      public void insert(int item){
            if(count==arr.length){
                  int[] big=new int[2*arr.length];
                   for(int i=0;i<count;i++){
                        big[i]=arr[i];
                   }
                   arr=big;
             }
             arr[count++] = item;
      }


      public void removeat(int index){
            if(index<0||index>=count){
                  System.out.println("there is no element inside");
                  return;
            }
                  for(int i=index;i<count-1;i++){
                        arr[i]=arr[i+1];
                  }

            count--;
      }

      public int indexof(int item){
        for(int i=0;i<count;i++){
              if(arr[i]==item){
                    return i;
              }
        }
        return  -1;
      }

      public static void main(String[] args){
            var a=new Arraysss(2);
            a.insert(10);
            a.insert(20);
            a.insert(30);
            a.insert(40);
            a.removeat(1);
            a.print();
            System.out.println(a.indexof(20));
      }
}
