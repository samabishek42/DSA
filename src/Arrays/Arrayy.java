package Arrays;

public class Arrayy {

        private int[] Items;
        private int count;

        private int[] newItems;
        public Arrayy(int length) {
            Items = new int[length];
        }
        public void insert(int item){

            this.use();

            Items[count++]=item;
        }

    private void use() {
        //If the array is oversized,make the array double the size
        if (Items.length == count) {
            newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = Items[i];
            }
        Items = newItems;
     }
    }
        public void removeAt( int index){
            if(count> Items.length|| index<0){
                throw new IllegalArgumentException();
            }
            for(int i=index ;i<count-1;i++){
             newItems [i] =Items[i+1];
            }
            count--;
        }
        public int  indexof(int item){
            for(int i=0;i<count;i++) {
                if (Items[i] == item) {
                    return i;
                }
            }
            return -1;

        }
        public  void max(){
            int c=Items[0];
            int maxindex=0;

            for(int i=1;i<count;i++){
                if (c<Items[i]){
                        c=Items[i];
                        maxindex=i;
                }
            }
            System.out.println(maxindex);
            System.out.println(c);
        }

        public void reverse(){
            int j=0;
            int[] NewItems = new int[count];
            for(int i=count-1;i>=0;i--){

                NewItems[j]=Items[i];
                j++;
            }
            for (int i=0;i<count;i++){
                System.out.println(NewItems[i]);
            }
    }
   public void InsertAt(int item,int index) {
//            if(Items.length == this.count) {
//               int newLength = Items.length * 2;
//               int[] newArr = new int[newLength];
//               for(int i=0;i<count;i++)
//                   newArr[i] = Items[i];
//               Items = newArr;
//            }
       this.use();
            for(int i=index;i<this.count;i++){
                Items[i+1] = Items[i];
            }
            Items[index] = item;
            count++;
   }

        public void print(){
            for(int i=0;i<count;i++){
                System.out.println(Items[i]);
            }
        }
    }


