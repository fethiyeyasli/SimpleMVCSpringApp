package com.bookshopping.model;

public class Item {

	private long itemId;
	private long parentItemId;
	private String name;
	private double salePrice;
	private String categoryPath;
	private String shortDescription;
	private String longDescription;
	private String brandName;
	private String thumbnailImage;
	private String mediumImage;
	private String largeImage;
	private String productTrackingUrl;
	private int standardShipRate;
	private String size;
	private String color;
	private boolean marketplace;
	private String sellerInfo;
	private String productUrl;
	private String customerRating;
	private int numReviews;
	private String customerRatingImage;
	private String categoryNode;
	private boolean bundle;
	private boolean clearance;
	private boolean preOrder;
	private String stock;
	private Attribute attributes;
	private String addToCartUrl;
	private String affiliateAddToCartUrl;
	private boolean freeShippingOver50Dollars;
	private boolean availableOnline;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getParentItemId() {
		return parentItemId;
	}
	public void setParentItemId(long parentItemId) {
		this.parentItemId = parentItemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public String getCategoryPath() {
		return categoryPath;
	}
	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getThumbnailImage() {
		return thumbnailImage;
	}
	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}
	public String getMediumImage() {
		return mediumImage;
	}
	public void setMediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
	}
	public String getLargeImage() {
		return largeImage;
	}
	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}
	public String getProductTrackingUrl() {
		return productTrackingUrl;
	}
	public void setProductTrackingUrl(String productTrackingUrl) {
		this.productTrackingUrl = productTrackingUrl;
	}
	public int getStandardShipRate() {
		return standardShipRate;
	}
	public void setStandardShipRate(int standardShipRate) {
		this.standardShipRate = standardShipRate;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isMarketplace() {
		return marketplace;
	}
	public void setMarketplace(boolean marketplace) {
		this.marketplace = marketplace;
	}
	public String getSellerInfo() {
		return sellerInfo;
	}
	public void setSellerInfo(String sellerInfo) {
		this.sellerInfo = sellerInfo;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public String getCustomerRating() {
		return customerRating;
	}
	public void setCustomerRating(String customerRating) {
		this.customerRating = customerRating;
	}
	public int getNumReviews() {
		return numReviews;
	}
	public void setNumReviews(int numReviews) {
		this.numReviews = numReviews;
	}
	public String getCustomerRatingImage() {
		return customerRatingImage;
	}
	public void setCustomerRatingImage(String customerRatingImage) {
		this.customerRatingImage = customerRatingImage;
	}
	public String getCategoryNode() {
		return categoryNode;
	}
	public void setCategoryNode(String categoryNode) {
		this.categoryNode = categoryNode;
	}
	public boolean isBundle() {
		return bundle;
	}
	public void setBundle(boolean bundle) {
		this.bundle = bundle;
	}
	public boolean isClearance() {
		return clearance;
	}
	public void setClearance(boolean clearance) {
		this.clearance = clearance;
	}
	public boolean isPreOrder() {
		return preOrder;
	}
	public void setPreOrder(boolean preOrder) {
		this.preOrder = preOrder;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public Attribute getAttributes() {
		return attributes;
	}
	public void setAttributes(Attribute attributes) {
		this.attributes = attributes;
	}
	public String getAddToCartUrl() {
		return addToCartUrl;
	}
	public void setAddToCartUrl(String addToCartUrl) {
		this.addToCartUrl = addToCartUrl;
	}
	public String getAffiliateAddToCartUrl() {
		return affiliateAddToCartUrl;
	}
	public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
		this.affiliateAddToCartUrl = affiliateAddToCartUrl;
	}
	public boolean isFreeShippingOver50Dollars() {
		return freeShippingOver50Dollars;
	}
	public void setFreeShippingOver50Dollars(boolean freeShippingOver50Dollars) {
		this.freeShippingOver50Dollars = freeShippingOver50Dollars;
	}
	public boolean isAvailableOnline() {
		return availableOnline;
	}
	public void setAvailableOnline(boolean availableOnline) {
		this.availableOnline = availableOnline;
	}
	
	
}
