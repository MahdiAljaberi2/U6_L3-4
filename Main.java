class Main {
  public static void main(String[] args){

 String[] words2 = {"Apple","Banana","Cherry","Grape","Orange"};

 //for each
 for(String fruit:words2)
 {
   System.out.println(fruit);
 }

 //for each print only fruits with length 5
 for(String fruit:words2)
 {
   if(fruit.length()==5)
   {
     System.out.println(fruit);
   }
 }

 int[] nums4={12,65,80,70,34,22};
 int sum=0;

 for(int x:nums4)
 {
   sum+=x;
 }

//System.out.printf()
System.out.print("The average of nums is ");
System.out.println("%.2f%n",((double)sum/num4.length));

/*
for (int i=0;i<words2.length;i++)
{
  String firstl=words2[i].substring(0,1);
  String lastl=words2[i].substring(words2[i].length()-1);
  System.out.println("Index Value: "+i+"\nWord: "+words2[i]+"\nFirst Letter: "+firstl+"\nLast Letter: "+lastl);
}

//inserting

int[] nums={12,65,80,70,34,22};
int pos=3;
int value=99;

for (int i=0;i<nums.length;i++)
{
  System.out.println(nums[i]+" ");
}

for (int i=nums.length-1;i<pos;i--)
{
  nums[i]=nums[i-1];
}
nums[pos]=value;

for (int i=0;i<nums.length;i++)
{
  System.out.println(nums[i]+" ");
}

//removing
int start=2;

for (int i=start;i<nums.length-1;i++)
{
  nums[i]=nums[i+1];
}

for (int i=0;i<nums.length;i++)
{
  System.out.println(nums[i]+" ");
}
*/

/*
//shift to the left
int[] nums2={1,2,3,4};
int temp=nums2[0];

for (int i=0;i<nums2.length-1;i++)
{
  nums2[i]=nums2[i+1];
}
nums2[nums2.length-1]=temp;

for (int i=0;i<nums2.length;i++)
{
  System.out.print(nums2[i]+" ");
}

//shift to the right
int temp2=nums2[nums2.length-1];

for (int i=nums2.length-1;i>0;i--)
{
  nums2[i]=nums2[i-1];
}
nums2[0]=temp2;

System.out.println();
for (int i=0;i<nums2.length;i++)
{
  System.out.print(nums2[i]+" ");
}

//reversing the elements - using swap inside the loop

System.out.println();
for (int i=0;i<nums2.length/2;i++)
{
  int j=nums2.length-i-1;
  int temp3=nums2[i];
  nums2[i]=nums2[j];
  nums2[j]=temp3;
}

for (int i=0;i<nums2.length;i++)
{
  System.out.print(nums2[i]+" ");
}
*/
  }
}