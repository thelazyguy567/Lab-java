class Buffer_String{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Hello");
        //sb.append(" Java");
        //sb.insert(1,"Java");
        //sb.replace(1,3,"Java");
        //sb.delete(1, 3);
        sb.reverse();
        System.out.println(sb);
    }
}