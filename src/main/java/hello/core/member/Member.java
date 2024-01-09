package hello.core.member;

public class Member {

    private Long id;
    private String name;
    private Member member;

    public Member(Long id, String name, Member member) {
        this.id = id;
        this.name = name;
        this.member = member;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getGrade() {
        return member;
    }

    public void setGrade(Member member) {
        this.member = member;
    }

}
