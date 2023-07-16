import java.util.Scanner;
public class LeaderInArray{
    public static void leaderArray(int arr[]){
        int max=arr[arr.length-1];
        System.out.print(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }

        }
    }
    public static void main(String ar[]){
        Scanner scanner =new Scanner(System.in);
        int sze=scanner.nextInt();
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        leaderArray(arr);
    }
}