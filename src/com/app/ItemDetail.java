package com.app;

public class ItemDetail {
		private int gst;
		private int costPrice;
		private int sellPrice;
		private boolean isAvailabe;
		
		
		public boolean getIsAvailabe() {
			return isAvailabe;
		}
		public void setIsAvailabe(boolean isAvailabe) {
			this.isAvailabe = isAvailabe;
		}
		public int getGst() {
			return gst;
		}
		public void setGst(int gst) {
			this.gst = gst;
		}
		public int getCostPrice() {
			return costPrice;
		}
		public void setCostPrice(int costPrice) {
			this.costPrice = costPrice;
		}
		public int getSellPrice() {
			return sellPrice;
		}
		public void setSellPrice(int sellPrice) {
			this.sellPrice = sellPrice;
		}
		@Override
		public String toString() {
			return "ItemDetail [gst=" + gst + ", costPrice=" + costPrice + ", sellPrice=" + sellPrice + ", isAvailabe="
					+ isAvailabe + "]";
		}
		
		
}
