public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){

        // Add your code here
        if (myArray.length == other.length)
        {
            for (int i = 0; i < myArray.length; i++)
            {
                if (other[i].length != myArray[i].length)
                {
                    return false;
                }
                for (int j = 0; j < myArray[i].length; j++)
                {
                    if (!other[i][j].equals(myArray[i][j]))
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

}
