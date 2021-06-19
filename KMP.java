package array;
class KMP{

    static void fillPrefixTable(int prefix[], String pattern){

        int j=0;
        prefix[0]=0;
        int i=1;

        while(i!=pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(j)){
                prefix[i]=j+1;
                j++;
                i++;
            }
            else{
                if(j==0){
                    prefix[i]=0;
                    i++;
                }
                else{
                    j=prefix[j-1];
                }
            }
        }
    }
    static int kmp_searching(String pattern , int prefix[],String text){

        int i=0;
        int j=0;
        int count=0;

        while(i<text.length()){
            if(pattern.charAt(j)==text.charAt(i)){
                if(j==(pattern.length()-1)){
                    count++;
                    j=prefix[j];
                    i++;
                }
                else{
                        i++;
                        j++;
                }
            }
            else{
                if(j>0){
                    j=prefix[j-1];
                }
                if(j==0){
                    i++;
                }
            }
        }
return count;
    }
    public static void main(String[] args) {
    
        String text="abcabcab";
        String pattern="abcab";
        int prefix[]=new int[pattern.length()];
        fillPrefixTable(prefix,pattern);
        

        int count=kmp_searching(pattern ,prefix,text);
        System.out.println(count);
    }
}
