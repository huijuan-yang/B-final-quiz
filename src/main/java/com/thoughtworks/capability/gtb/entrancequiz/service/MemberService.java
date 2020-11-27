package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private List<Member> memberList = new ArrayList<>();

    public MemberService() {
        this.memberList.add(new Member(1, "成吉思汗"));
        this.memberList.add(new Member(2, "鲁班七号"));
        this.memberList.add(new Member(3, "太乙真人"));
        this.memberList.add(new Member(4, "钟无艳"));
        this.memberList.add(new Member(5, "花木兰"));
        this.memberList.add(new Member(6, "雅典娜"));
        this.memberList.add(new Member(7, "芈月"));
        this.memberList.add(new Member(8, "白起"));
        this.memberList.add(new Member(9, "刘禅"));
        this.memberList.add(new Member(10, "庄周"));
        this.memberList.add(new Member(11, "马超"));
        this.memberList.add(new Member(12, "刘备"));
        this.memberList.add(new Member(13, "哪吒"));
        this.memberList.add(new Member(14, "大乔"));
        this.memberList.add(new Member(15, "蔡文姬"));
    }

    public List<Member> getAllMembers() {
        return memberList;
    }
}
