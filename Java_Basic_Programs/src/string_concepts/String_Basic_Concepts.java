package string_concepts;

public class String_Basic_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String s1 = "Switch on the button";
	    int n1 = s1.indexOf('o');
	    System.out.println("n1 = " + n1);
	    int n2 = s1.indexOf('o', 10);
	    System.out.println("n2 = " + n2);
	    int n3 = s1.indexOf("on");
	    System.out.println("n3 = " + n3);
	    int n4 = s1.indexOf("on",12);
	    System.out.println("n4 = " + n4);

		
	}

}

/*

Characters and String in Java
We interact with each other through words and sentences. So, there must be some way by which Java 
should also play with these words or sentences. And that is exactly what we are going to do in this 
chapter.

Characters
You all must be knowing about characters. In Java, the data type to store characters is char.

In Java, characters are represented using Unicode. Unicode is an international character set representing
 all the characters.

In Java, char ranges from 0 to 65,535.

Characters are always written within ' '.

Let's see an example.

class C1{
public static void main(String[] args){
  char c1, c2;
  c1 = 'd';
  c2 = 88;
  System.out.println("c1 = " + c1 + ",c2 = " + c2);
}
}
Output
Here, c2 is assigned a value 88 which is the Unicode value for letter 'X'.

Strings
We can think of a string as a collection of characters. In other words, it is an array of characters,
 like "Robin" is a string.

In Java programming, strings are objects. Before understanding it, let's first see how to declare a string.

String s = "Hello";

We can also declare it as

String s = {'h','e','l','l','o'};

Here, s is a string having the value Hello. s is an object of the class String.

Thus 's' is an String object having its value "Hello".

As stated that string is an array of characters, in the second example we are declaring string as an array
 of characters.

We can also create String objects using the new keyword. Here, the new keyword is used to create an 
object 's' of the class String. The following codes are used to create a String object 's' having its 
value "Hello".

String s = new String("Hello");

char ch = {'h','e','l','l','o'};
String s = new String(ch);

For now, there is no need to go into the details of objects and classes as we will learn more about
 these later.

Now, let's see an example that assigns and prints the values of two strings, one using the new keyword 
and the other without it.

class C2{
public static void main(String[] args){
  String s1 = "String and characters";
  String s2 = new String("String and characters");
  System.out.println(s1);
  System.out.println(s2);
}
}
Output
String class methods
There are many methods of a String object in Java which perform many important operations. 
For that, we first need to include java.lang.String class in our program. To do this, we need to
 write the following code in the very beginning of our program.

import java.lang.String;

The String class methods are listed below.

Method	Description
char charAt(int index)	returns char value for particular index
int length()	returns string length
String substring(int startIndex)	returns substring for given start index
String substring(int startIndex, int endIndex)	returns substring for given start index and end index
boolean equals(Object anotherObject)	checks the equality of string with object
boolean isEmpty()	checks if string is empty
String concat(String str)	links two strings
String replace(char oldChar, char newChar)	replaces old character with new character value in string
String replaceAll(String oldSubstring, String newSubstring)	replaces each substring that matches oldSubstring with a substring that matches newSubstring in string
String toLowerCase()	returns string in lowercase
String toUpperCase()	returns string in uppercase
int indexOf(char ch)	returns index of specified character
int indexOf(char ch, int startIndex)	returns index value of specified character starting with given index
int indexOf(String substring)	returns index of specified substring
int indexOf(String substring, int startIndex)	returns index value of specified substring starting with given index
boolean contains(CharacterSequence t)	checks if string contains the specified character sequence
String trim()	omits leading and trailing white spaces
boolean startWith(String str)	checks if the string starts with the specified substring
boolean startWith(String str, int startIndex)	checks if the string starts with the specified substring starting from the specified index
boolean endsWith(String str)	checks if the string ends with the specified substring
int compareTo(Object obj)	compares string with object
int compareTo(String anotherString)	compares string with another string
Now let's quickly have a look at their examples.

char charAt(int index)

It returns the character value for the specified index in a string.

class C3{
  public static void main(String[] args){
    String s1 = "Hello";
    char ch = s1.charAt(2);
    System.out.println(ch);
  }
}
Output
The character at index 2 in s1 is l. So, charAt(2) returned l.

int length()

It returns the length of string including white spaces.

class C4{
  public static void main(String[] args){
    String s1 = "Hello World";
    int len = s1.length();
    System.out.println("String length is " + len);
  }
}
Output
String substring(int startIndex) or String substring(int startIndex, int endIndex)

It returns a substring depending on the start index and the end index.

class C5{
  public static void main(String[] args){
    String s1 = "Umbrella";
    String s2 = s1.substring(2);
    String s3 = s1.substring(2,6);
    System.out.println(s2);
    System.out.println(s3);
  }
}
Output-
brella
brel

substring(2) returned a new string from the character at the second index i.e. b till last. But substring(2,6) returned a new string from the character at index 2 i.e. b till the character at index 6 i.e. l.

boolean isEmpty()

It checks whether a string has a NULL value or not.

class C6{
  public static void main(String[] args){
    String s1 = "Umbrella";
    String s2 = "";
    System.out.println(s1.isEmpty());
    System.out.println(s2.isEmpty());
  }
}
Output-
false
true

String concat(String str)

It concatenates or links or joins two strings.

class C7{
  public static void main(String[] args){
    String s1 = "Codes";
    s1 = s1.concat("Dope");
    System.out.println(s1);
  }
}
Output- CodesDope

String replace(char oldChar, char newChar)

It replaces old characters having the same value as oldChar with a new character having the value same as that of newChar in a string.

class C8{
  public static void main(String[] args){
    String s1 = "Welcome to Codesdope";
    String s2 = s1.replace('o','D');
    System.out.println(s2);
  }
}
Output-  WelcDme tD CDdesdDpe

String replaceAll(String oldSubstring, String newSubstring)

It replaces old substring having the same value as oldCSubstring with a new substring having the value same as that of newSubstring in a string.

class C9{
  public static void main(String[] args){
    String s1 = "Switch on the button o and n";
    String s2 = s1.replaceAll("on","ui");
    System.out.println(s2);
  }
}
Output- Switch ui the buttui o and n

String toLowerCase() or String toUpperCase()

These return string in lowercase and uppercase respectively.

class C10{
  public static void main(String[] args){
    String s1 = "Welcome to Codesdope";
    String s2 = s1.toLowerCase();
    String s3 = s1.toUpperCase();
    System.out.println("String in lowercase : " + s2);
    System.out.println("String in uppercase : " + s3);
  }
}
Output
int indexOf(char ch) or int indexOf(char ch, int startIndex) or int indexOf(String substring) or int indexOf(String substring, int startIndex)

These return the index value of specified character or substring depending upon the start index. If multiple indices occur of a character or a substring, then the smallest value of the index of the character or string will be returned.

class C11{
  public static void main(String[] args){
    String s1 = "Switch on the button";
    int n1 = s1.indexOf('o');
    System.out.println("n1 = " + n1);
    int n2 = s1.indexOf('o', 10);
    System.out.println("n2 = " + n2);
    int n3 = s1.indexOf("on");
    System.out.println("n3 = " + n3);
    int n4 = s1.indexOf("on",12);
    System.out.println("n4 = " + n4);
  }
}
Output-
n1 = 7
n2 = 18
n3 = 7
n4 = 18
boolean contains(CharacterSequence t)

It checks if a string contains the specified character sequence.

class C12{
  public static void main(String[] args){
    String s1 = "My name is : Robert Brown";
    System.out.println(s1.contains("Robe"));
    System.out.println(s1.contains(":"));
    System.out.println(s1.contains("/"));
  }
}
Output
Difference between equals() method and ==
Whenever we create a new object, it is allocated some location in the memory.For example, if we write

String s1 = new String("Welcome");

Here, object s1 is created and given some location in the memory. Its value is assigned as "Welcome".

When we create another object s2, it is also given some location in the memory( since it is also a new object). Its value is also assigned as "Welcome".

String s2 = new String("Welcome");

Thus, we have two objects with different memory locations and the same value "Welcome".

== operator compares two objects
class C13{
  public static void main(String[] args){
    String s1 = new String("Welcome");
    String s2 = new String("Welcome");
    if(s1 == s2)
      System.out.println("Both objects are equal");
    else
      System.out.println("Different objects");
  }
}
OutputDifferent objects

Since s1 and s2 are different objects having different memory locations, therefore the condition (s1 == s2) is false.

Consider another example.

class C14{
  public static void main(String[] args){
    String s1 = new String("Welcome");
    String s2 = s1;
    if(s1 == s2)
      System.out.println("Both objects are equal");
    else
      System.out.println("Different objects");
}
}
Output
In the above example, object s2 is created and assigned the same memory location as that of s1. So, the two objects are same in this case.

equals() method
It compares the contents of two objects. An example will make it clear.

class C15{
  public static void main(String[] args){
    String s1 = new String("Welcome");
    String s2 = new String("Welcome");
    if(s1.equals(s2))
      System.out.println("Values of both objects are equal");
    else
      System.out.println("Values of both objects are not equal");
  }
}
Output
Though both the objects are different, but since their values are same, so the condition (s1.equals(s2)) is true





*/