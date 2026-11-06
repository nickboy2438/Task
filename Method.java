class MethodExample {
    public int getSquare(int num) 
    {
        int result = num * num;
        return result; 
    }

    public static void main(String[] args) 
    {
        MethodExample example = new MethodExample();
        int outcome = example.getSquare(5); 
        System.out.println("Square of 5 is: " + outcome);
    }
}
