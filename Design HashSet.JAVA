class MyHashSet {

    LinkedList list = new LinkedList<>();
    
    public MyHashSet() 
    {
        list = new LinkedList<>();
    }

    public void add(int key) 
    {
        if(!list.contains(key))
        {
            list.add(key);
        }
    }

    public void remove(int key) 
    {
        if(list.indexOf(Integer.valueOf(key))>=0)
        {
            list.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) 
    {
        if(list.contains(key))
        {
            return true;
        }
        return false;
    }
}
