package dto;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	int number;
	String name;
	int seat;
	String[] stations;
	String[] price;
	String[] time;
	String[] days;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String[] getStations() {
		return stations;
	}
	public void setStations(String[] stations) {
		this.stations = stations;
	}
	public String[] getPrice() {
		return price;
	}
	public void setPrice(String[] price) {
		this.price = price;
	}
	public String[] getTime() {
		return time;
	}
	public void setTime(String[] time) {
		this.time = time;
	}
	public String[] getDays() {
		return days;
	}
	public void setDays(String[] days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Train [number=" + number + ", name=" + name + ", seat=" + seat + ", stations="
				+ Arrays.toString(stations) + ", price=" + Arrays.toString(price) + ", time=" + Arrays.toString(time)
				+ ", days=" + Arrays.toString(days) + "]";
	}
	
}
