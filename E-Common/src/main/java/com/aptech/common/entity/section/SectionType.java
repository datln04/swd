package com.aptech.common.entity.section;

public enum SectionType {
	PRODUCT {
		public String toString() { return "Product"; }
	}, 
	
	CATEGORY {
		public String toString() { return "Category"; }
	},
	
	BRAND {
		public String toString() { return "Brand"; }
	}, 
	
	ARTICLE {
		public String toString() { return "Article"; }
	}, 
	
	TEXT {
		public String toString() { return "Text"; }
	},
	
	ALL_CATEGORIES {
		public String toString() { return "All_Categories"; }
	},	
	
	ALL_SHOPS {
		public String toString() { return "All_Shops"; }
	}	
}
