package com.turesw.oms.cafecounter.dto;

public class QnAInfo {

    String qnaTitle;
    String qnaContent;
    String qnaStart;
    String qnaEnd;
    int state;

    public QnAInfo() {

    }

    public QnAInfo(String _qnaTitle, String _qnaContent, String _qnaStart, String _qnaEnd, int _state)

    {
        this.qnaTitle = _qnaTitle;
        this.qnaContent = _qnaContent;
        this.qnaStart = _qnaStart;
        this.qnaEnd = _qnaEnd;
        this.state = _state;
    }

    public void put(String key, String object) {
        if (key.equals("qnaTitle"))
            this.qnaTitle = object;
        else if (key.equals("qnaContent"))
            this.qnaContent = object;
        else if (key.equals("qnaStart"))
            this.qnaStart = object;
        else if (key.equals("qnaEnd"))
            this.qnaEnd = object;
        else if (key.equals("state"))
            this.state = Integer.parseInt(object);
    }

    public String get_qnaitle() {
        return qnaTitle;
    }

    public String get_qnaContent() {
        return qnaContent;
    }

    public String get_qnaStart() {
        return qnaStart;
    }

    public int get_state() {
        return state;
    }
}
