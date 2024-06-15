package com.practise.Testcodeapplication.problems.strings;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringReverse {
    public static String reverseWords(String S)
    {
        // code here
        StringBuffer buffer=new StringBuffer();

        String [] strArray=S.split("\\.");
        for(int i=strArray.length-1;i>=0;i--)
        {
            buffer.append(strArray[i]).append(".");

        }
        return buffer.substring(0,buffer.length()-3);

    }
    public static void main(String[] args) {

        log.info("Reverse :"+reverseWords("i.like.this.program.very.much"));

    }
}
