package test;

import java.time.LocalDate;

public class Article {

  /** 投稿者 */
  private String contributor;

  /** 投稿日 */
  private LocalDate date;

  /** いいね数 */
  private int goodCount;

  /** コンストラクタ */
  public Article(String contributor, LocalDate date, int goodCount) {
    this.contributor = contributor;
    this.date = date;
    this.goodCount = goodCount;
  }

  /** Getter, Setter */
  public String getContributor() {
    return this.contributor;
  }

  public void setContributor(String contributor) {
    this.contributor = contributor;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getGoodCount() {
    return this.goodCount;
  }

  public void setGoodCount(int goodCount) {
    this.goodCount = goodCount;
  }

}