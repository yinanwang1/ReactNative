//
//  ViewController.m
//  ReactNative
//
//  Created by ArthurWang on 2017/5/17.
//  Copyright © 2017年 Arthur. All rights reserved.
//

#import "ViewController.h"

#import "RCTRootView.h"

@interface ViewController ()



@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


- (IBAction)onSelectedReactNatvieBtn:(id)sender
{
    NSURL *jsCodeLocation = [NSURL URLWithString:@"http://10.0.55.146:8081/index.ios.bundle?platform=ios"];
    
    RCTRootView *rootView = [[RCTRootView alloc] initWithBundleURL:jsCodeLocation
                                                        moduleName:@"RNHighScores"
                                                 initialProperties:@{
                                                                     @"scores": @[
                                                                            @{
                                                                             @"name": @"Alex",
                                                                             @"value": @"42"
                                                                             },
                                                                            @{
                                                                                @"name": @"Joel",
                                                                                @"value": @"10",
                                                                                }
                                                                     ]
                                                                     }
                                                     launchOptions:nil];
    
    UIViewController *vc = [[UIViewController alloc] init];
    vc.view = rootView;
    
    [self presentViewController:vc animated:YES completion:nil];
}



@end
