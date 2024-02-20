class arr{
    public static void main(String[] args) {
      /*  //3 floats and sum
        float[] arr=new float[4];
        float sum=0;
      arr[0]=23.3f;
      arr[1]=23.7f;
      arr[2]=23.4f;
      for(int i=0;i<arr.length-1;i++){
        System.out.println(arr[i]);
        sum=sum+arr[i];
      
      }
      System.out.println(sum);

      //check array elemnt is persent in array
      int num[]={499,40,41,3,6,7,33,44,45,67,5};
      int no=40;
      for(int i=0;i<num.length;i++){
      System.out.println(num[i]);
      if(no==num[i]){
        System.out.println("yes");
        break;
      }
      else{
        System.out.println("no");
      }
      }

      //calculate average of marks
      int marks[]={44,55,66,44,33,45};
      int summ=0;
      for(int i=0;i<marks.length;i++){
        summ=summ+marks[i];
        
      }
      float av=summ/marks.length;
      System.out.println(av);
      


      //reverse array
      int[] ary={1,2,3,4,5,6,7,8};
      for(int i=ary.length-1;i>=0;i--){
        System.out.println(ary[i]);
      }
       //another mathod of reverse using swap
       int[] ary2={2,21,31,41,51};
       int l=ary2.length;
       int n=Math.floorDiv(l, 2);
       int temp;
       for(int i=0;i<n;i++){
        temp=ary2[i];
        ary2[i]=ary2[l-1-i];
        ary2[l-1-i]=temp;
       }
       for(int j:ary2){
        System.out.println(j);
       }
*/

      //find maximum in array
      int[] aar={33,44,55,-600,7,8,88,55,323};
      int max=Integer.MIN_VALUE;                   //max=Integer.MIN_VALUE; or min=Integer.MAX_VALUE;
      for(int i:aar){
        if(i>max){
          max=i;
        }
      }
      System.out.println("the maximum no of this array is:"+max);


      // check array is sorted 
      boolean isSorted=true;
      int[] arrr={2,1,4,5,6,3,9,8};
      for(int i=0;i<arrr.length-1;i++){
        if(arrr[i]>arrr[i+1]){
          isSorted=false;
          break;
        }
      }
      if(isSorted){
        System.out.println("the array is sorted");
      }
      else{
        System.out.println("the array is not sorted");
      }

      //sorting
      int[] arr={2,1,4,9,6,3,9,8};
      int temp;
      for(int i=0;i<arrr.length-1;i++){
        for(int j=0;j<arrr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
         temp= arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
        }
      }
    }
      for(int pp:arr){
        System.out.print(pp);
        System.out.print(" ");
      }
    }
  }