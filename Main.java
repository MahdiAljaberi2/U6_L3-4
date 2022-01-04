class Main {
  public static void main(String[] args) {
   String[] words2 = {"Apple","Banana","Cherry","Grape","Orange"};

for (int i=0;i<words2.length;i++)
{
  String firstl=words2[i].substring(0,1);
  String lastl=words2[i].substring(words2[i].length()-1);
  System.out.println("Index Value: "+i+"\nWord: "+words2[i]+"\nFirst Letter: "+firstl+"\nLast Letter: "+lastl);
}

  }
}