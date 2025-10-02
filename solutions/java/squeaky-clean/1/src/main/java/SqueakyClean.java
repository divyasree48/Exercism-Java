class SqueakyClean {
    static String clean(String identifier) 
    {
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < identifier.length(); i++)
                {
                    char ch = identifier.charAt(i);
                    if(Character.isWhitespace(ch))
                        res.append('_');

                    else if(ch == '-')
                        {
                            if(i+1 < identifier.length())
                            {
                                char c = identifier.charAt(i+1);
                                res.append(Character.toUpperCase(c));
                                i += 1;
                            }
                        }

                    else if(ch == '4')
                        res.append('a');
                    else if(ch == '3')
                        res.append('e');
                    else if(ch == '0')
                        res.append('o');
                    else if(ch == '1')
                        res.append('l');
                    else if(ch == '7')
                        res.append('t');

                    else if(Character.isLetter(ch))
                        res.append(ch);
                }
        return res.toString();
    }
}
