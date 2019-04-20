package String;

/**
 * @program: offer
 * @description:
 * @author: Mr.Q
 * @create: 2019-04-18 15:15
 **/
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if (str == null)
            return null;
        //新建一个StringBuilder对象存放修改后的字符串
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            //如果第i项是空格，追加%20
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
