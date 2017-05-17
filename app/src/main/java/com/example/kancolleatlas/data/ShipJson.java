package com.example.kancolleatlas.data;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

public class ShipJson {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPron() {
		return pron;
	}

	public void setPron(String pron) {
		this.pron = pron;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getNextlv() {
		return nextlv;
	}

	public void setNextlv(String nextlv) {
		this.nextlv = nextlv;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getMax_hp() {
		return max_hp;
	}

	public void setMax_hp(String max_hp) {
		this.max_hp = max_hp;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public String getFire() {
		return fire;
	}

	public void setFire(String fire) {
		this.fire = fire;
	}

	public String getTorpedo() {
		return torpedo;
	}

	public void setTorpedo(String torpedo) {
		this.torpedo = torpedo;
	}

	public String getAac() {
		return aac;
	}

	public void setAac(String aac) {
		this.aac = aac;
	}

	public String getAss() {
		return ass;
	}

	public void setAss(String ass) {
		this.ass = ass;
	}

	public String getEvasion() {
		return evasion;
	}

	public void setEvasion(String evasion) {
		this.evasion = evasion;
	}

	public String getSeek() {
		return seek;
	}

	public void setSeek(String seek) {
		this.seek = seek;
	}

	public String getLuck() {
		return luck;
	}

	public void setLuck(String luck) {
		this.luck = luck;
	}

	public String getMax_armor() {
		return max_armor;
	}

	public void setMax_armor(String max_armor) {
		this.max_armor = max_armor;
	}

	public String getMax_fire() {
		return max_fire;
	}

	public void setMax_fire(String max_fire) {
		this.max_fire = max_fire;
	}

	public String getMax_torpedo() {
		return max_torpedo;
	}

	public void setMax_torpedo(String max_torpedo) {
		this.max_torpedo = max_torpedo;
	}

	public String getMax_aac() {
		return max_aac;
	}

	public void setMax_aac(String max_aac) {
		this.max_aac = max_aac;
	}

	public String getMax_ass() {
		return max_ass;
	}

	public void setMax_ass(String max_ass) {
		this.max_ass = max_ass;
	}

	public String getMax_evasion() {
		return max_evasion;
	}

	public void setMax_evasion(String max_evasion) {
		this.max_evasion = max_evasion;
	}

	public String getMax_seek() {
		return max_seek;
	}

	public void setMax_seek(String max_seek) {
		this.max_seek = max_seek;
	}

	public String getMax_luck() {
		return max_luck;
	}

	public void setMax_luck(String max_luck) {
		this.max_luck = max_luck;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getBullet() {
		return bullet;
	}

	public void setBullet(String bullet) {
		this.bullet = bullet;
	}

	public String getCarry() {
		return carry;
	}

	public void setCarry(String carry) {
		this.carry = carry;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	@SerializedName("id")
	private String id;
	
	@SerializedName("no")
	private String no;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("pron")
	private String pron;
	
	@SerializedName("type")
	private String type;
	
	@SerializedName("next")
	private String next;
	
	@SerializedName("nextlv")
	private String nextlv;
	
	@SerializedName("hp")
	private String hp;
	
	@SerializedName("max_hp")
	private String max_hp;
	
	@SerializedName("armor")
	private String armor;
	
	@SerializedName("fire")
	private String fire;
	
	@SerializedName("torpedo")
	private String torpedo;
	
	@SerializedName("aac")
	private String aac;
	
	@SerializedName("ass")
	private String ass;
	
	@SerializedName("evasion")
	private String evasion;
	
	@SerializedName("seek")
	private String seek;
	
	@SerializedName("luck")
	private String luck;
	
	@SerializedName("max_armor")
	private String max_armor;
	
	@SerializedName("max_fire")
	private String max_fire;
	
	@SerializedName("max_torpedo")
	private String max_torpedo;
	
	@SerializedName("max_aac")
	private String max_aac;
	
	@SerializedName("max_ass")
	private String max_ass;
	
	@SerializedName("max_evasion")
	private String max_evasion;
	
	@SerializedName("max_seek")
	private String max_seek;
	
	@SerializedName("max_luck")
	private String max_luck;
	
	@SerializedName("speed")
	private String speed;
	
	@SerializedName("range")
	private String range;
	
	@SerializedName("slot")
	private String slot;
	
	@SerializedName("fuel")
	private String fuel;
	
	@SerializedName("bullet")
	private String bullet;
	
	@SerializedName("carry")
	private String carry;
	
	@SerializedName("equip")
	private String equip;
	
}
