class GarbageCollection
{
    public static void main (String[] args)
    {
    	int[] speicher = new int[10];
        for (int j = 0; j < 10; j++)
        {
            speicher[j] = -1;
        }
        
    	for (int i = 0; i < 10; i ++)
        {
            for (int j = 0; j < 5; j++)
            {
                update(speicher);
            }

            collect(speicher);
        }
    }
    
    public static void update (int[] speicher)
    {
    	int n = (int)(Math.random() * 10);
        speicher[n] = (int)(Math.random() * 11);
        if (speicher[n] == n) speicher[n] = -1;
    }
    
    public static void output (int[] speicher)
    {
    	for (int i = 0; i < 10; i++) System.out.print(speicher[i] + " ");
        System.out.println();
    }

    public static void collect (int[] speicher)
    {
		// hier den Algorithmus implementieren
        
        output(speicher);
    }
}
