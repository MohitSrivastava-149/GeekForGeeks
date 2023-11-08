public class FirstFit 
{
     public static void main(String args[]){
            int arr[] ={100, 500, 200, 450, 600}; 
            int pro[]={212, 417, 112, 426};
            for(int i=0;i<pro.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(pro[i]<=arr[j]){
                        arr[j]=arr[j]-pro[i];
                        System.out.print("Indext value: "+j+"\n");
                         System.out.print("Remaining memeory space after implement: "+arr[j]);
                         System.out.println("");
                        break;
    
                    }
    
                }
            }
        }
    
    }
