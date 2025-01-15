package com.itwillbs.mvc_board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.itwillbs.mvc_board.vo.BoardVO;

@Mapper
public interface BoardMapper {
	// 글 등록
	public int registBoard(BoardVO board);

	// 게시물 목록 조회
	// => 주의! Mapper에 전달되는 복수개의 파라미터는 @Param 어노테이션으로 이름 구별 필요
	public List<BoardVO> getBoardList(
			@Param("startRow") int startRow,
			@Param("listLimit") int listLimit);
	
	// 전체 게시물 수 조회
	public int getBoardListCount();

	// 게시물 상세 조회
	public BoardVO getBoard(int board_num);

}
