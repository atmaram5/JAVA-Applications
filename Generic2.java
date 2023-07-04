class Generic2
{
    public static <T> void Display ( T Arr[])
    {
        for ( T no: Arr)
        {
            System.out.println(no);
        }
    }
    public static void main(String Arg [])
    {
       Integer A[] = {10,20,30,40};
       Float   B[] = {50.89f,60.21f,70.14f};
       Double  C[] = {50.45,13.44,25.48};

       Display(A);
       Display(B);
       Display(C);
    }
}