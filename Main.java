class Main {
  public static void main(String[] args){

 String[] words2 = {"Apple","Banana","Cherry","Grape","Orange"};

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

  


  }
}