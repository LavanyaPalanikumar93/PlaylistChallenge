package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int forward = 0;
        int backward = 0;
        for (int i = startIndex; i < this.playList.length; i++) {
            if (this.playList[i].equals(selection)) {
            }
            forward++;
        }
        for (int i = startIndex; i >=0; i--) {
            if (this.playList[i].equals(selection)) {
            }
            backward++;
        }
if(forward<backward){
    return forward;
}else{
    return backward;
}
    }
}
