// Last updated: 9/7/2026, 4:27:54 PM
import java.time.LocalDate;

class Solution {
	public int dayOfYear(String date) {
		return LocalDate.parse(date).getDayOfYear();
	}
}