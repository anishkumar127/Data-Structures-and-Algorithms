public int numUniqueEmails(String[] emails) {
	HashSet<String> uniqueEmails = new HashSet<>(emails.length);

	for (String email : emails) {
		String sanitizedEmail = "";
		int indexOfPlusSign = email.indexOf("+");
		int indexOfAtSign = email.indexOf("@");

		if (indexOfPlusSign > 0) {
			sanitizedEmail += email.substring(0, indexOfPlusSign);
		} else {
			sanitizedEmail += email.substring(0, indexOfAtSign);
		}

		// removing the dots in the local name
		sanitizedEmail = sanitizedEmail.replace(".", "");
		sanitizedEmail += email.substring(indexOfAtSign);

		// HashSet will do the dedup for us
		uniqueEmails.add(sanitizedEmail);
	}

	return uniqueEmails.size();
}






class Solution {
    public int numUniqueEmails(String[] emails) {
        // to hold unique emails
		Set<String> set = new HashSet<>();
        // loop through available emails
		for (String email : emails){
            //to hold temporary processed emails
			StringBuilder temp = new StringBuilder();
            int i = 0;
            //loop until you see '@'
			while (email.charAt(i) != '@'){
                char c = email.charAt(i);
                //if 'c' then increment the index and continue as per the rule
				if (c == '.'){
                    i++;
                    continue;  
                } 
                else if (c == '+') break;  // dont have to see the strings further
                else temp.append(c);  // add to the temporary otherwise
                i++;
            }
            
            while (email.charAt(i) != '@') i++;  // making sure to move our index to '@'
            while (i < email.length()) temp.append(email.charAt(i++)); // add to the temporary emails
            set.add(temp.toString()); // add to the set
        }
        return set.size();   // return the size
    }
}




Think of the string as 3 separate parts.

Stuff before the first +
Stuff between the first + and @
Everything after the @
Stuff before the first +

Currently we haven't seen '+' yet
So keep all character as long as it's not '.'
Stuff between the first + and @

Since we've seen '+', but not '@' yet, don't keep any letters (we don't enter the third if statement so replaceIndex stays the same)
Everything after the @

Take all characters including '@' and '.'
How do we keep a letter? We do this by using a char array and maintaining a pointer replaceIndex.

replaceIndex starts at 0 and we increment if we keep the letter
If we don't keep the letter, replaceIndex stays the same, but the for loop continues iterating
Next time when we do want to replace, we'll take the current for loop character c and put it into position replaceIndex in the same array
Take an example like dog.cat@leetcode.com

When we get to index 3 with the '.' char, replaceIndex stays at 3.
In the next for loop iteration at index 4, we get the letter 'c'
We replace index 3 which has the '.' with the letter 'c' so the char array will be dogccat@leetcode.com
Eventually we will get in our char array dogcat@leetcode.comm which we convert to a string and use substring() on
Basically we are building our string one letter at a time, but instead of putting it in a new array, we're reusing the array

d
do
dog
dogc
dogca
dogcat
dogcat@ etc...
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        
        for(String email : emails) {
            char[] chars = email.toCharArray();
            int n = chars.length;
            int replaceIndex = 0;
            
            boolean seenAt = false;
            boolean seenPlus = false;
            
            for(int i = 0; i < n; i++) {
                char c = chars[i];
				
                if(c == '@') {
                    seenAt = true;
                }
                if(c == '+') {
                    seenPlus = true;
                }
                if(seenAt || (!seenPlus && c != '.')) {
                    chars[replaceIndex] = c;
                    replaceIndex++;
                }
            }
            String s = String.valueOf(chars);
            set.add(s.substring(0, replaceIndex));
        }
        return set.size();
    }
}



class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet<String> hset = new HashSet<>();
        for(String email:emails)
        {
            StringBuilder s = new StringBuilder();
            boolean flag = true;
            for(int i=0;i<email.length();i++)
            {
                if(email.charAt(i)=='+')
                    flag = false;
                else if(email.charAt(i)!='.' && flag==true && email.charAt(i)!='@')
                    s.append(email.charAt(i));
                if(email.charAt(i)=='@')
                {
                    s.append(email.substring(i));
                    break;
                }
            }
            hset.add(s.toString());
        }
        return hset.size();
    }
}



class Solution {
    /**
     * Normalize email address
     * <p>
     * Specification:
     * <ol>
     *     <li>If we see <b>.</b> then we MUST delete that <b>.</b></li>
     *     <li>If we see <b>+</b> then we MUST delete all after <b>+</b> before <b>@</b></li>
     * </ol>
     * <b>Domain name in email we MUST don't change</b> this mean that string process only
     * before <b>@</b>
     *
     * @param email string which MUST be normalized by rules from specification
     * @return normalized email
     */
    private static String normalizeEmail(String email) {
        var sb = new StringBuilder(email);

        for (int i = 0; i < sb.length(); i++) {
            var l = sb.charAt(i);

            if (l == '.')
                sb.deleteCharAt(i);
            else if (l == '+')
                sb.delete(i, sb.indexOf("@"));

            if (l == '+' || l == '@')
                break;
        }

        return sb.toString();
    }

    public int numUniqueEmails(String[] emails) {
        var set = new HashSet<String>();

        for (var e : emails)
            set.add(normalizeEmail(e));

        return set.size();
    }
}





class Solution {
    public int numUniqueEmails(String[] emails) {
        String[] copy = new String[emails.length];
        HashSet<String> set = new HashSet<>();
        for(String email: emails){
            StringBuilder localName = new StringBuilder();
            boolean local = true;
            int index = -1;
            for(char c: email.toCharArray()){
                index++;
                if(c == '.')
                    continue;
                if(c == '+'){
                    local = false;
                    continue;
                }
                if(c == '@')
                    break;
                else if(local)
                    localName.append(c);
            }
            set.add(localName.toString() + email.substring(index));
        }
        return set.size();
    }
}

// test cases failing.
class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> set = new HashSet<>();
        
        for(String email:emails){
            
            StringBuilder address = new StringBuilder();
            for(int i=0; i<email.length(); i++){
                
                char every_ch = email.charAt(i);
                
                if(every_ch=='.'){
                    continue;    // ignoring the .
                }else if (every_ch=='+'){
                    while(email.charAt(i)!='@'){
                        i++; // increase the pointer. to ignoring the  after + to until @ come.
                    }
                    address.append(email.substring(i+1)); // after come @ add the entire string till i+1;
                }else{
                    address.append(every_ch); // if . + not then append the string.
                }
            }
            set.add(address.toString()); // adding the string.
        }
        return set.size(); // returning the size of set.
    }
}
