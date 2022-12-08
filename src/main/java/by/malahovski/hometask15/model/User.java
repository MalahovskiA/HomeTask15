package by.malahovski.hometask15.model;

public class User {
    private Long  idUser;
    private String nameUser;
    private Integer ageUser;

    public User(Long idUser, String nameUser, Integer ageUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.ageUser = ageUser;
    }

    public Long getIdUser(Long id) {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Integer getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(Integer ageUser) {
        this.ageUser = ageUser;
    }
}
