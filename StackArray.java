public class StackArray {


    int arr[]=new int[5];
    int cursor=0;
    public int add(int a){
       // if(cursor<=arr.length-1)
                arr[cursor++] = a;
        return a;
   }

    public int remove(){
      //  if(cursor>-1) {
         int e=arr[cursor];
            cursor--;
      //  }

            return e;
    }

    public static void main(String[] args) {
        StackArray sa=new StackArray();
      int r=  sa.add(30);
        int r1 = sa.add(10);
        int r2=  sa.add(40);
        int r3 = sa.add(50);

        System.out.println(r+" "+r1+" "+r2+" "+r3);
    int e1 = sa.remove();
     System.out.println(e1);
        int e2 = sa.remove();
        System.out.println(e2);



    }
    }




