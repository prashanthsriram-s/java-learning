class ClassLoaderExample
{
    public static void main(String args[])
    {
        System.out.println(ClassLoaderExample.class.getClassLoader());
        System.out.println(String.class.getClassLoader());
        System.out.println(String.class.getName());
    }
};