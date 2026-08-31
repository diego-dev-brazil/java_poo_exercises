
package application;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(7);
		System.out.println("\n==Test 1 seller findById==\n" + seller);
		
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println("\n==Test 2seller findByDepartment==\n");
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		List<Seller> list2 = sellerDao.findAll();
		System.out.println("\n==Test 3 seller findAll==\n");
		for(Seller sel : list2) {
			System.out.println(sel);
		}
		
		System.out.println("\n==Test 4 seller Insert==\n");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("\n==Test 5 seller Update==\n");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n==Test 6 seller Delete==\n");
		System.out.println("Enter id for delete: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");


	}
}