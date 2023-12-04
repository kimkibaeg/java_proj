package com.my.movie;

import java.util.List;
import java.util.Scanner;

public class MovieMenu {
	
	void movieMenu() {
		
		Scanner sc = new Scanner(System.in) ;
		MovieMenu mm1 = new MovieMenu() ;
		MovieMgr mgr = new MovieMgr();
		int select ;
		String title ;
		String director ;
		int grade ;
		String genre ;
		
		out:	do {
			System.out.println("==============================================");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 감독별 검색");
			System.out.println("5. 영화 장르별 검색");
			System.out.println("6. 영화 정보 삭제");
			System.out.println("0. 종료");
			System.out.println("==============================================");
			System.out.println("위의 정수를 입력해 주세요 >>> ");
			select = sc.nextInt() ;
			
			switch (select) {
			case 1 : 
				// 영화 정보 입력
				Movie mv = new Movie();
				System.out.println("영화 제목를 입력하세요 : ");
				mv.setTitle(sc.next());
				System.out.println("감독 이름을 입력하세요 : ");
				mv.setDirector(sc.next());
				System.out.println("영화 등급을 입력하세요 : ");
				mv.setGrade(sc.nextInt());
				System.out.println("영화 장르를 입력하세요 : ");
				mv.setGenre(sc.next());

				mgr.add(mv);
				break;
			
			case 2 :
				// 영화 정보 전체 검색
				mgr.search();
                break;
				
				
			case 3 :
				// 영화명 검색
				mgr.search(sc.next()) ;
                break;
				
				
			case 4 :
				// 영화 감독별 검색
				mgr.searchDirector(sc.next()) ;
                break;
                
                
			case 5 :
				// 영화 장르별 검색
				List<Movie> a = mgr.searchGenre(sc.next()) ;
				
				for ( int i = 0 ; i < a.size(); i++) {
					System.out.println(a.get(i));
				}
				
                break;
                
                
			case 6 :
				// 영화 정보 삭제
				mgr.delete(sc.next());
                break;
                
                
			case 0 :
				// 종료
                break out ;
				
			
			
			}
			
		}while (true) ;
	
}

		
	}

