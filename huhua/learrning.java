class pair {
    public int x,y;
    public pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void display()
    {
        System.out.println(x+":"+y);
    }
}

class ArrayDemo {
    public static void main(String[] args) {
        for(String x: args)
            System.out.println(x);
        pair p1 = new pair(2, 3);
        pair p2 = p1;
        p2.x=22;
        p1.y = 5;
        p2.display();
        pair p3 = new pair(0,0);
        p3.display();
        new pair(5,6).display();
    }
} 