package basic.ThuVienSimple.src;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuGuest implements Menu{
    public void show()
    {
        System.out.println("1.Tìm kiếm item");
        System.out.println("2.Xem danh sách");
        System.out.println(("3.Logout"));
    }
    public void timKiem(Scanner sc, ArrayList<Item> items) {
        System.out.println("Nhập từ khóa tìm kiếm:");
        String keyWord = sc.nextLine();
        System.out.println("Chọn chế độ hiển thị:");
        System.out.println("1.Dạng bảng");
        System.out.println("2.Dạng danh sách");
        String option = sc.nextLine();
        if (option.equals("2")) {
            System.out.println("Dánh sách sản phẩm tìm kiếm được:");
            System.out.println("-----");
            for (Item item : items) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    if (book.getName().contains(keyWord)
                            || String.valueOf(book.getPrice()).contains(keyWord)
                            || book.getGenre().contains(keyWord)
                            || book.getAuthor().contains(keyWord)
                            || book.getNhaXuatBan().contains(keyWord)
                            || String.valueOf(book.getNamXuatBan()).contains(keyWord)
                            || book.getLanguage().contains(keyWord)) {
                        book.show();
                        System.out.println("-----");
                    }
                } else if (item instanceof Notebook) {
                    Notebook notebook = (Notebook) item;
                    if (notebook.getName().contains(keyWord)
                            || String.valueOf(notebook.getPrice()).contains(keyWord)
                            || notebook.getBrand().contains(keyWord)
                            || String.valueOf(notebook.getSoTrang()).contains(keyWord)
                            || notebook.getLoaiVo().contains(keyWord)
                            || notebook.getMauSac().contains(keyWord)
                            || notebook.getChatLieu().contains(keyWord)
                            || notebook.getKichThuoc().contains(keyWord)) {
                        notebook.show();
                        System.out.println("-----");
                    }
                } else if (item instanceof Pen) {
                    Pen pen = (Pen) item;
                    if (pen.getName().contains(keyWord)
                            || String.valueOf(pen.getPrice()).contains(keyWord)
                            || pen.getBrand().contains(keyWord)
                            || pen.getMauSac().contains(keyWord)
                            || pen.getChatLieu().contains(keyWord)
                            || pen.getLoaiMuc().contains(keyWord)
                            || pen.getDoMin().contains(keyWord)) {
                        pen.show();
                        System.out.println("-----");
                    }
                } else if (item instanceof Pencil) {
                    Pencil pencil = (Pencil) item;
                    if (pencil.getName().contains(keyWord)
                            || String.valueOf(pencil.getPrice()).contains(keyWord)
                            || pencil.getBrand().contains(keyWord)
                            || pencil.getMauSac().contains(keyWord)
                            || pencil.getChatLieu().contains(keyWord)
                            || pencil.getDoCung().contains(keyWord)) {
                        pencil.show();
                        System.out.println("-----");
                    }
                }
            }
        } else {
            // Calculate maximum lengths for each column
            for (Item item : items) {
                if (item.getName().length() > maxLen_Name) maxLen_Name = item.getName().length();
                if (String.valueOf(item.getPrice()).length() > maxLen_Price) maxLen_Price = String.valueOf(item.getPrice()).length();
                if (item.getBrand().length() > maxLen_Brand) maxLen_Brand = item.getBrand().length();
                
                if (item instanceof Book) {
                    Book book = (Book) item;
                    maxLen_Bonus = Math.max(maxLen_Bonus, (book.getGenre() + "- Thể loại: ").length());
                    maxLen_Bonus = Math.max(maxLen_Bonus, (book.getAuthor() + "- Tác giả: ").length());
                    maxLen_Bonus = Math.max(maxLen_Bonus, (book.getNhaXuatBan() + "- Nhà xuất bản: ").length());
                    maxLen_Bonus = Math.max(maxLen_Bonus, (String.valueOf(book.getNamXuatBan()) + "- Năm xuất bản: ").length());
                    maxLen_Bonus = Math.max(maxLen_Bonus, (book.getLanguage() + "- Ngôn ngữ: ").length());
                } else if (item instanceof Notebook) {
                    Notebook notebook = (Notebook) item;
                    maxLen_Bonus = Math.max(maxLen_Bonus, (String.valueOf(notebook.getSoTrang()) + "- Số trang: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getLoaiVo() + "- Loại vở: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getMauSac() + "- Màu sắc bìa: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getChatLieu() + "- Chất liệu giấy: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getKichThuoc() + "- Kích thước: ").length());
                    // Continue for other attributes of Notebook
                }
                else if(item instanceof Pen)
                {
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getMauSac() + "- Màu sắc: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getChatLieu() + "- Chất liệu: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getLoaiMuc() + "- Loại mực: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getDoMin() + "- Độ mịn: ").length());
                }
                else if(item instanceof Pencil)
                {
                    maxLen_Bonus = max(maxLen_Bonus, (((Pencil) item).getMauSac() + "- Màu sắc: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pencil) item).getChatLieu() + "- Chất liệu: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pencil) item).getDoCung() + "- Độ cứng: ").length());
                }
                // Continue for Pen and Pencil
            }
        
            // Print table header
            System.out.printf("%-" + maxLen_Name + "s %-" + maxLen_Price + "s %-" + maxLen_Brand + "s %-" + maxLen_Bonus + "s\n", "Tên sản phẩm", "Giá bán", "Thương hiệu", "Thông tin thêm");
            // Print each item in table format
            for (Item item : items) {
                String bonusInfo = "";
                if (item instanceof Book) {
                    Book book = (Book) item;
                    bonusInfo = book.getGenre() + "- Thể loại: ";
                    // Concatenate other book-specific info to bonusInfo
                } else if (item instanceof Notebook) {
                    Notebook notebook = (Notebook) item;
                    bonusInfo = String.valueOf(notebook.getSoTrang()) + "- Số trang: ";
                    // Continue for other attributes of Notebook
                }
                // Continue for Pen and Pencil
                
                System.out.printf("%-" + maxLen_Name + "s %-" + maxLen_Price + "s %-" + maxLen_Brand + "s %-" + maxLen_Bonus + "s\n", item.getName(), item.getPrice(), item.getBrand(), bonusInfo);
            }
        }
        // Handle option "1.Dạng bảng" if needed
    }

    public void xemDanhSach(ArrayList<Item> items)
    {
        for(Item item : items)
        {
            if(item instanceof Book) ((Book) item).show();
            else if(item instanceof Notebook) ((Notebook) item).show();
            else if(item instanceof InkPen) ((InkPen) item).show();
            else if(item instanceof Pencil) ((Pencil) item).show();
        }
        System.out.println();
    }
}
