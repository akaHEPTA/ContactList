public class Contact {
    // Fields
    private String name;
    private String mobile;
    private String work;
    private String home;
    private String city;

    // Constructors
    public Contact() { }

    public Contact(String name, String mobile, String work, String home, String city) {
        if (!name.isEmpty()) this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
        this.city = city;
    }

    // Accessor
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    public String getCity() {
        return city;
    }

    // Mutator
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String result = String.format("<" + name +"> (mobile=" + mobile);
        if(!work.isEmpty()) result += (", work=" + work);
        if(!home.isEmpty()) result += (", home="+home);
        if(!city.isEmpty()) result += (", city="+city);
        return result + ')';
    }

}
