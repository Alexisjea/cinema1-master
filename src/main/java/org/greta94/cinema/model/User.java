package org.greta94.cinema.model;

public class User {
  private String userName;

  public User(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
  /**
   * @param film
   * @return
   *
   */
  public boolean checkVote(Film film){
    return film.getVotes().stream().anyMatch(vote -> vote.getUser().equals(this));
  }

  public Vote recupVote(Film film){
    for (Vote vote: film.getVotes()
         ) {
      if(vote.getUser().getUserName().equals(this.userName)){
        return vote;
      }
    }
    return null;
  }
}

