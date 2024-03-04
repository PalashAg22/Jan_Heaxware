package dao;

import java.util.List;

import entity.Dept;

public interface IDept {
	public int insert(Dept dep);
	public int update(Dept dep);
	public int deleteOne(String username, String password);
	public Dept selectOne(String username);
	public List<Dept> selectAll();
}
