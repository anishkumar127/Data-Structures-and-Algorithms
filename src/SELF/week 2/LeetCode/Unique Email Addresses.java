

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
