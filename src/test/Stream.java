package test;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
  public static void main(String[] args) {
    // データ生成
    Article a1 = new Article("Taro", LocalDate.of(2018, 7, 11), 15);
    Article a2 = new Article("Taro", LocalDate.of(2015, 11, 1), 53);
    Article a3 = new Article("Taro", LocalDate.of(2015, 10, 31), 54);

    Article a4 = new Article("Hanako", LocalDate.of(2017, 2, 5), 53);
    Article a5 = new Article("Hanako", LocalDate.of(2016, 11, 1), 160);
    Article a6 = new Article("Hanako", LocalDate.of(2012, 8, 20), 22);

    Article a7 = new Article("Pochi", LocalDate.of(2013, 3, 16), 38);
    Article a8 = new Article("Pochi", LocalDate.of(2011, 9, 25), 200);
    Article a9 = new Article("Pochi", LocalDate.of(2018, 4, 13), 10);

    // リスト作成
    List<Article> list = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);
   
    // Comparator作成
    //comparing部分を変えることでソートのキーが変わる
    //現時点では名前順
    Comparator<Article> comparator = Comparator.comparing(Article::getContributor);

    list = list.stream().sorted(comparator)
  		.collect(Collectors.toList());  
    list.stream().forEach(a ->
    System.out.println(a.getContributor() + " " + a.getDate() + " " + a.getGoodCount()));
    
    

  }
}