package com.airbnb.repository;

import com.airbnb.domain.mainpage.MainPage;
import com.airbnb.domain.mainpage.navigation.Navigation;
import com.airbnb.domain.mainpage.search.*;
import org.springframework.stereotype.Repository;

@Repository
public class MainPageRepository {
    public MainPage getMainPage() {
        Navigation navigation = new Navigation(new String[]{"숙소", "체험", "온라인체험"});
        Location location = new Location("위치", "어디로 여행가세요?", new String[]{"강남구", "종로구", "마포구", "가까운 여행지 둘러보기"}, true);
        SearchInputComponents searchInputComponents = new SearchInputComponents(location);
        Calendar calendar = new Calendar(new String[]{"체크인", "체크아웃"}, "날짜 입력");
        Price price = new Price("요금", "금액대 설정", "가격 범위", new String[]{"평균 1박 요금은", "입니다"});
        Guests guests = new Guests("인원", "게스트 추가");
        Search search = new Search(searchInputComponents, calendar, price, guests);

        return new MainPage(navigation, search);
    }
}
