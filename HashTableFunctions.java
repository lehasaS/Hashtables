/**
 * @author Lehasa Seoe (SXXLEH001)
 * 14 May 2020
 * This class hashes simple textual data 
 */
class HashTableFunctions
{
   int hashTableSize;
   String[] hashTableArray;
   
   // constructor
    /**
     * This is the constructor and it initializes the instance variables
     * @param size it is the size of the array we use
     * @param array It is an array for our hash table
     */
   public HashTableFunctions ( int size, String [] array )
   {
      hashTableSize = size;
      hashTableArray = array;
   }

   // hash function
   /**
     * This is our hash function
     * @param s this is the string to be hashed
     */
   public int hash ( String s )
   {
      int sum = 0;
      
      // WRITE YOUR CODE HERE
	sum= s.charAt(0) +2*s.charAt(1)+ 3*s.charAt(2); /* I used a bash script to obtain the 3-tuple (1,2,3)
							that gives a perfect hash function since you never
							get the same tuple for these words, given the choice of the function i chose*/

      return ((sum%37)+37)%37;
   }   
   
   // return True if the hash table contains string s
   // return False if the hash table does not contain string s
   /**
     * This is our find method
     * @param s this is the string to be found
     */
   boolean find ( String s )
   {
      boolean found = false;
      
      // WRITE YOUR CODE HERE
      for (int i=0 ; i< hashTableSize ; i++){
         if (hashTableArray[i].equals(s)) {
            found = true;
         }
      }
      
      return found;
   }
}
