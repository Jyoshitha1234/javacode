class arr3{
    public static void main(String[] args) {
        int target=8;
        int[] arr={1,2,3,4,5};
      target(arr,target);
    }
    public static void target(int[] arr,int tr){
        boolean status=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if( arr[i] + arr[j]==tr){
                  status=true;
                  System.out.println(arr[i]+"+"+arr[j]+"="+tr);
                }
            }
            
       
        }
        

       }  
     }
